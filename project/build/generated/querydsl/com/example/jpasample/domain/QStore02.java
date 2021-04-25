package com.example.jpasample.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QStore02 is a Querydsl query type for Store02
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStore02 extends EntityPathBase<Store02> {

    private static final long serialVersionUID = 1645515251L;

    public static final QStore02 store02 = new QStore02("store02");

    public final QStoreItem _super = new QStoreItem(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath maker = _super.maker;

    //inherited
    public final StringPath name = _super.name;

    //inherited
    public final StringPath nutrition = _super.nutrition;

    //inherited
    public final NumberPath<Integer> price = _super.price;

    public QStore02(String variable) {
        super(Store02.class, forVariable(variable));
    }

    public QStore02(Path<? extends Store02> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStore02(PathMetadata metadata) {
        super(Store02.class, metadata);
    }

}

