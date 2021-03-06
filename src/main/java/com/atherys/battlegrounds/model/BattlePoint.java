package com.atherys.battlegrounds.model;

import org.spongepowered.api.boss.ServerBossBar;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

import java.time.Duration;
import java.util.*;

public class BattlePoint {

    private String id;

    private String name;

    private ServerBossBar bossBar;

    private Location<World> location;

    private double innerRadius;

    private double outerRadius;

    private float perTickCaptureAmount;

    private Duration respawnInterval;

    private Duration respawnTimeout;

    private List<RespawnPoint> respawnPoints = new ArrayList<>();

    private Set<Award> captureAwards = new HashSet<>();

    private Set<Award> tickAwards = new HashSet<>();

    private Map<Team, Float> teamProgress = new HashMap<>();

    private Team controllingTeam;

    public BattlePoint(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location<World> getLocation() {
        return location;
    }

    public void setLocation(Location<World> location) {
        this.location = location;
    }

    public double getInnerRadius() {
        return innerRadius;
    }

    public void setInnerRadius(double innerRadius) {
        this.innerRadius = innerRadius;
    }

    public double getOuterRadius() {
        return outerRadius;
    }

    public void setOuterRadius(double outerRadius) {
        this.outerRadius = outerRadius;
    }

    public float getPerTickCaptureAmount() {
        return perTickCaptureAmount;
    }

    public void setPerTickCaptureAmount(float perTickCaptureAmount) {
        this.perTickCaptureAmount = perTickCaptureAmount;
    }

    public Duration getRespawnInterval() {
        return respawnInterval;
    }

    public void setRespawnInterval(Duration respawnInterval) {
        this.respawnInterval = respawnInterval;
    }

    public Duration getRespawnTimeout() {
        return respawnTimeout;
    }

    public void setRespawnTimeout(Duration respawnTimeout) {
        this.respawnTimeout = respawnTimeout;
    }

    public List<RespawnPoint> getRespawnPoints() {
        return respawnPoints;
    }

    public void setRespawnPoints(List<RespawnPoint> respawnPoints) {
        this.respawnPoints = respawnPoints;
    }

    public Set<Award> getCaptureAwards() {
        return captureAwards;
    }

    public void setCaptureAwards(Set<Award> captureAwards) {
        this.captureAwards = captureAwards;
    }

    public Set<Award> getTickAwards() {
        return tickAwards;
    }

    public void setTickAwards(Set<Award> tickAwards) {
        this.tickAwards = tickAwards;
    }

    public Map<Team, Float> getTeamProgress() {
        return teamProgress;
    }

    public void setTeamProgress(Map<Team, Float> teamProgress) {
        this.teamProgress = teamProgress;
    }

    public Team getControllingTeam() {
        return controllingTeam;
    }

    public void setControllingTeam(Team controllingTeam) {
        this.controllingTeam = controllingTeam;
    }

    public ServerBossBar getBossBar() {
        return bossBar;
    }

    public void setBossBar(ServerBossBar bossBar) {
        this.bossBar = bossBar;
    }
}
