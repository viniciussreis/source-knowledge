package br.com.source.knowledge.configuration;

import br.com.source.knowledge.sqs.consumer.SQSConsumerListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sqs.SqsClient;
import software.amazon.awssdk.services.sqs.model.ReceiveMessageRequest;

@Configuration
public class SQSBeanConfiguration {

    @Value("${spring.cloud.aws.sqs.region}")
    private String region;

    @Value("${spring.cloud.aws.sqs.queue-url}")
    private String queueUrl;

    @Value("${spring.cloud.aws.sqs.queue-name}")
    private String queueName;

    @Value("${spring.cloud.aws.sqs.access-key}")
    private String accessKeyId;

    @Value("${spring.cloud.aws.sqs.secret-key}")
    private String secretAccessKey;


    @Bean
    public SQSConsumerListener sqsConsumerListener() {
        return new SQSConsumerListener();
    }

    @Bean
    public SqsClient sqsClient(){
        var sqsClient = SqsClient.builder().build();

        sqsClient = SqsClient.builder()
                .region(Region.of(region))
                .credentialsProvider(StaticCredentialsProvider.create(AwsBasicCredentials.create(accessKeyId, secretAccessKey)))
                .build();

        ReceiveMessageRequest receiveMessageRequest = ReceiveMessageRequest.builder()
                .queueUrl(queueUrl)
                .waitTimeSeconds(20)
                .maxNumberOfMessages(1)
                .build();

        var message = sqsClient.receiveMessage(receiveMessageRequest);

        System.out.println(message);

        return sqsClient;
    }
}
