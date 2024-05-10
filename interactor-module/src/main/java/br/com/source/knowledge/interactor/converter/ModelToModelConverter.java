package br.com.source.knowledge.interactor.converter;

public interface ModelToModelConverter<T, P> {

    P convert(T model);
}
