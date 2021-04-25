package com.example.jpasample.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QStoreItem is a Querydsl query type for StoreItem
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStoreItem extends EntityPathBase<StoreItem> {

    private static final long serialVersionUID = 793002724L;

    public static final QStoreItem storeItem = new QStoreItem("storeItem");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath maker = createString("maker");

    public final StringPath name = createString("name");

    public final StringPath nutrition = createString("nutrition");

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public QStoreItem(String variable) {
        super(StoreItem.class, forVariable(variable));
    }

    public QStoreItem(Path<? extends StoreItem> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStoreItem(PathMetadata metadata) {
        super(StoreItem.class, metadata);
    }

}

