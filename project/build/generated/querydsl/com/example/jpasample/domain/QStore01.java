package com.example.jpasample.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QStore01 is a Querydsl query type for Store01
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStore01 extends EntityPathBase<Store01> {

    private static final long serialVersionUID = 1645515250L;

    public static final QStore01 store01 = new QStore01("store01");

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

    public QStore01(String variable) {
        super(Store01.class, forVariable(variable));
    }

    public QStore01(Path<? extends Store01> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStore01(PathMetadata metadata) {
        super(Store01.class, metadata);
    }

}

