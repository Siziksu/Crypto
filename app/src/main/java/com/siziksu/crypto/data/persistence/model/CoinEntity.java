package com.siziksu.crypto.data.persistence.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class CoinEntity extends RealmObject {

    @PrimaryKey
    public int id;
    public String name;
    public String symbol;
    public String logo;
    public int rank;
    public String priceUsd;
    public String priceBtc;
    public long volumeUsd24h;
    public long marketCapUsd;
    public long availableSupply;
    public long totalSupply;
    public String percentChange1h;
    public String percentChange24h;
    public String percentChange7d;
    public String createdAt;
    public String updatedAt;
}
