package com.ntcc.statsservice.entity;

import javax.persistence.*;

@Table(name = "stats_item")
public class StatsItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "stats_domain")
    private String statsDomain;

    @Column(name = "stats_value")
    private Long statsValue;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return stats_domain
     */
    public String getStatsDomain() {
        return statsDomain;
    }

    /**
     * @param statsDomain
     */
    public void setStatsDomain(String statsDomain) {
        this.statsDomain = statsDomain;
    }

    /**
     * @return stats_value
     */
    public Long getStatsValue() {
        return statsValue;
    }

    /**
     * @param statsValue
     */
    public void setStatsValue(Long statsValue) {
        this.statsValue = statsValue;
    }
}