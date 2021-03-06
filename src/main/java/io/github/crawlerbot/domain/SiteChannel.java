package io.github.crawlerbot.domain;

import io.github.crawlerbot.domain.enumeration.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A SiteChannel.
 */
@Document(collection = "site_channel")
@org.springframework.data.elasticsearch.annotations.Document(indexName = "sitechannel")
public class SiteChannel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("url")
    private String url;

    @Field("content_type")
    private DocType contentType;

    @Field("schedule")
    private String schedule;

    @Field("schedule_time_zone")
    private String scheduleTimeZone;

    @Field("total_level")
    private Integer totalLevel;

    @Field("archive_level")
    private Integer archiveLevel;

    @Field("unlimited_level")
    private Boolean unlimitedLevel;

    @Field("fetch_engine")
    private FetchEngine fetchEngine;

    @Field("category")
    private String category;

    @Field("tag")
    private String tag;

    @Field("category_slug")
    private String categorySlug;

    @Field("tag_slug")
    private String tagSlug;

    @Field("country_code")
    private String countryCode;

    @Field("language_code")
    private String languageCode;

    @Field("target_queue_channel")
    private String targetQueueChannel;

    @Field("topics")
    private String topics;

    @Field("topic_slugs")
    private String topicSlugs;

    @Field("post_type")
    private PostType postType;

    @Field("ranking_country")
    private Integer rankingCountry;

    @Field("channel_total_level")
    private Integer channelTotalLevel;

    @Field("channel_archive_level")
    private Integer channelArchiveLevel;

    @Field("channel_fetch_engine")
    private FetchEngine channelFetchEngine;

    @Field("channel_ranking")
    private Integer channelRanking;

    @Field("channel_target_queue")
    private String channelTargetQueue;

    @Field("channel_target_post_type")
    private PostType channelTargetPostType;

    @Field("channel_level_one_fetch_engine")
    private FetchEngine channelLevelOneFetchEngine;

    @Field("channel_level_two_fetch_engine")
    private FetchEngine channelLevelTwoFetchEngine;

    @Field("channel_level_three_fetch_engine")
    private FetchEngine channelLevelThreeFetchEngine;

    @Field("channel_level_four_fetch_engine")
    private FetchEngine channelLevelFourFetchEngine;

    @Field("channel_level_one_content_type")
    private DocType channelLevelOneContentType;

    @Field("channel_level_two_content_type")
    private DocType channelLevelTwoContentType;

    @Field("channel_level_three_content_type")
    private DocType channelLevelThreeContentType;

    @Field("channel_level_four_content_type")
    private DocType channelLevelFourContentType;

    @Field("channel_allow_external_url")
    private Boolean channelAllowExternalUrl;

    @Field("channel_logo")
    private String channelLogo;

    @Field("channel_site_name")
    private String channelSiteName;

    @Field("logo")
    private String logo;

    @Field("site_name")
    private String siteName;

    @Field("channel_type")
    private ChannelType channelType;

    @Field("level_one_fetch_engine")
    private FetchEngine levelOneFetchEngine;

    @Field("level_two_fetch_engine")
    private FetchEngine levelTwoFetchEngine;

    @Field("level_three_fetch_engine")
    private FetchEngine levelThreeFetchEngine;

    @Field("level_four_fetch_engine")
    private FetchEngine levelFourFetchEngine;

    @Field("level_one_content_type")
    private DocType levelOneContentType;

    @Field("level_two_content_type")
    private DocType levelTwoContentType;

    @Field("level_three_content_type")
    private DocType levelThreeContentType;

    @Field("level_four_content_type")
    private DocType levelFourContentType;

    @Field("allow_external_url")
    private Boolean allowExternalUrl;

    @Field("site_url")
    private String siteUrl;

    @Field("target_channel")
    private TargetChannel targetChannel;

    @Field("target")
    private TargetChannel target;

    @Field("site_domain")
    private String siteDomain;


    private Set<ChannelOuterLink> outers = new HashSet<>();


    private Set<ConfigMapping> mappings = new HashSet<>();


    private Set<ConfigGroup> configGroups = new HashSet<>();


    private Set<ConfigGroup> targetGroups = new HashSet<>();

    // simlife-needle-entity-add-field - Simlife will add fields here, do not remove
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public SiteChannel url(String url) {
        this.url = url;
        return this;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public DocType getContentType() {
        return contentType;
    }

    public SiteChannel contentType(DocType contentType) {
        this.contentType = contentType;
        return this;
    }

    public void setContentType(DocType contentType) {
        this.contentType = contentType;
    }

    public String getSchedule() {
        return schedule;
    }

    public SiteChannel schedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getScheduleTimeZone() {
        return scheduleTimeZone;
    }

    public SiteChannel scheduleTimeZone(String scheduleTimeZone) {
        this.scheduleTimeZone = scheduleTimeZone;
        return this;
    }

    public void setScheduleTimeZone(String scheduleTimeZone) {
        this.scheduleTimeZone = scheduleTimeZone;
    }

    public Integer getTotalLevel() {
        return totalLevel;
    }

    public SiteChannel totalLevel(Integer totalLevel) {
        this.totalLevel = totalLevel;
        return this;
    }

    public void setTotalLevel(Integer totalLevel) {
        this.totalLevel = totalLevel;
    }

    public Integer getArchiveLevel() {
        return archiveLevel;
    }

    public SiteChannel archiveLevel(Integer archiveLevel) {
        this.archiveLevel = archiveLevel;
        return this;
    }

    public void setArchiveLevel(Integer archiveLevel) {
        this.archiveLevel = archiveLevel;
    }

    public Boolean isUnlimitedLevel() {
        return unlimitedLevel;
    }

    public SiteChannel unlimitedLevel(Boolean unlimitedLevel) {
        this.unlimitedLevel = unlimitedLevel;
        return this;
    }

    public void setUnlimitedLevel(Boolean unlimitedLevel) {
        this.unlimitedLevel = unlimitedLevel;
    }

    public FetchEngine getFetchEngine() {
        return fetchEngine;
    }

    public SiteChannel fetchEngine(FetchEngine fetchEngine) {
        this.fetchEngine = fetchEngine;
        return this;
    }

    public void setFetchEngine(FetchEngine fetchEngine) {
        this.fetchEngine = fetchEngine;
    }

    public String getCategory() {
        return category;
    }

    public SiteChannel category(String category) {
        this.category = category;
        return this;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTag() {
        return tag;
    }

    public SiteChannel tag(String tag) {
        this.tag = tag;
        return this;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getCategorySlug() {
        return categorySlug;
    }

    public SiteChannel categorySlug(String categorySlug) {
        this.categorySlug = categorySlug;
        return this;
    }

    public void setCategorySlug(String categorySlug) {
        this.categorySlug = categorySlug;
    }

    public String getTagSlug() {
        return tagSlug;
    }

    public SiteChannel tagSlug(String tagSlug) {
        this.tagSlug = tagSlug;
        return this;
    }

    public void setTagSlug(String tagSlug) {
        this.tagSlug = tagSlug;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public SiteChannel countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public SiteChannel languageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getTargetQueueChannel() {
        return targetQueueChannel;
    }

    public SiteChannel targetQueueChannel(String targetQueueChannel) {
        this.targetQueueChannel = targetQueueChannel;
        return this;
    }

    public void setTargetQueueChannel(String targetQueueChannel) {
        this.targetQueueChannel = targetQueueChannel;
    }

    public String getTopics() {
        return topics;
    }

    public SiteChannel topics(String topics) {
        this.topics = topics;
        return this;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    public String getTopicSlugs() {
        return topicSlugs;
    }

    public SiteChannel topicSlugs(String topicSlugs) {
        this.topicSlugs = topicSlugs;
        return this;
    }

    public void setTopicSlugs(String topicSlugs) {
        this.topicSlugs = topicSlugs;
    }

    public PostType getPostType() {
        return postType;
    }

    public SiteChannel postType(PostType postType) {
        this.postType = postType;
        return this;
    }

    public void setPostType(PostType postType) {
        this.postType = postType;
    }

    public Integer getRankingCountry() {
        return rankingCountry;
    }

    public SiteChannel rankingCountry(Integer rankingCountry) {
        this.rankingCountry = rankingCountry;
        return this;
    }

    public void setRankingCountry(Integer rankingCountry) {
        this.rankingCountry = rankingCountry;
    }

    public Integer getChannelTotalLevel() {
        return channelTotalLevel;
    }

    public SiteChannel channelTotalLevel(Integer channelTotalLevel) {
        this.channelTotalLevel = channelTotalLevel;
        return this;
    }

    public void setChannelTotalLevel(Integer channelTotalLevel) {
        this.channelTotalLevel = channelTotalLevel;
    }

    public Integer getChannelArchiveLevel() {
        return channelArchiveLevel;
    }

    public SiteChannel channelArchiveLevel(Integer channelArchiveLevel) {
        this.channelArchiveLevel = channelArchiveLevel;
        return this;
    }

    public void setChannelArchiveLevel(Integer channelArchiveLevel) {
        this.channelArchiveLevel = channelArchiveLevel;
    }

    public FetchEngine getChannelFetchEngine() {
        return channelFetchEngine;
    }

    public SiteChannel channelFetchEngine(FetchEngine channelFetchEngine) {
        this.channelFetchEngine = channelFetchEngine;
        return this;
    }

    public void setChannelFetchEngine(FetchEngine channelFetchEngine) {
        this.channelFetchEngine = channelFetchEngine;
    }

    public Integer getChannelRanking() {
        return channelRanking;
    }

    public SiteChannel channelRanking(Integer channelRanking) {
        this.channelRanking = channelRanking;
        return this;
    }

    public void setChannelRanking(Integer channelRanking) {
        this.channelRanking = channelRanking;
    }

    public String getChannelTargetQueue() {
        return channelTargetQueue;
    }

    public SiteChannel channelTargetQueue(String channelTargetQueue) {
        this.channelTargetQueue = channelTargetQueue;
        return this;
    }

    public void setChannelTargetQueue(String channelTargetQueue) {
        this.channelTargetQueue = channelTargetQueue;
    }

    public PostType getChannelTargetPostType() {
        return channelTargetPostType;
    }

    public SiteChannel channelTargetPostType(PostType channelTargetPostType) {
        this.channelTargetPostType = channelTargetPostType;
        return this;
    }

    public void setChannelTargetPostType(PostType channelTargetPostType) {
        this.channelTargetPostType = channelTargetPostType;
    }

    public FetchEngine getChannelLevelOneFetchEngine() {
        return channelLevelOneFetchEngine;
    }

    public SiteChannel channelLevelOneFetchEngine(FetchEngine channelLevelOneFetchEngine) {
        this.channelLevelOneFetchEngine = channelLevelOneFetchEngine;
        return this;
    }

    public void setChannelLevelOneFetchEngine(FetchEngine channelLevelOneFetchEngine) {
        this.channelLevelOneFetchEngine = channelLevelOneFetchEngine;
    }

    public FetchEngine getChannelLevelTwoFetchEngine() {
        return channelLevelTwoFetchEngine;
    }

    public SiteChannel channelLevelTwoFetchEngine(FetchEngine channelLevelTwoFetchEngine) {
        this.channelLevelTwoFetchEngine = channelLevelTwoFetchEngine;
        return this;
    }

    public void setChannelLevelTwoFetchEngine(FetchEngine channelLevelTwoFetchEngine) {
        this.channelLevelTwoFetchEngine = channelLevelTwoFetchEngine;
    }

    public FetchEngine getChannelLevelThreeFetchEngine() {
        return channelLevelThreeFetchEngine;
    }

    public SiteChannel channelLevelThreeFetchEngine(FetchEngine channelLevelThreeFetchEngine) {
        this.channelLevelThreeFetchEngine = channelLevelThreeFetchEngine;
        return this;
    }

    public void setChannelLevelThreeFetchEngine(FetchEngine channelLevelThreeFetchEngine) {
        this.channelLevelThreeFetchEngine = channelLevelThreeFetchEngine;
    }

    public FetchEngine getChannelLevelFourFetchEngine() {
        return channelLevelFourFetchEngine;
    }

    public SiteChannel channelLevelFourFetchEngine(FetchEngine channelLevelFourFetchEngine) {
        this.channelLevelFourFetchEngine = channelLevelFourFetchEngine;
        return this;
    }

    public void setChannelLevelFourFetchEngine(FetchEngine channelLevelFourFetchEngine) {
        this.channelLevelFourFetchEngine = channelLevelFourFetchEngine;
    }

    public DocType getChannelLevelOneContentType() {
        return channelLevelOneContentType;
    }

    public SiteChannel channelLevelOneContentType(DocType channelLevelOneContentType) {
        this.channelLevelOneContentType = channelLevelOneContentType;
        return this;
    }

    public void setChannelLevelOneContentType(DocType channelLevelOneContentType) {
        this.channelLevelOneContentType = channelLevelOneContentType;
    }

    public DocType getChannelLevelTwoContentType() {
        return channelLevelTwoContentType;
    }

    public SiteChannel channelLevelTwoContentType(DocType channelLevelTwoContentType) {
        this.channelLevelTwoContentType = channelLevelTwoContentType;
        return this;
    }

    public void setChannelLevelTwoContentType(DocType channelLevelTwoContentType) {
        this.channelLevelTwoContentType = channelLevelTwoContentType;
    }

    public DocType getChannelLevelThreeContentType() {
        return channelLevelThreeContentType;
    }

    public SiteChannel channelLevelThreeContentType(DocType channelLevelThreeContentType) {
        this.channelLevelThreeContentType = channelLevelThreeContentType;
        return this;
    }

    public void setChannelLevelThreeContentType(DocType channelLevelThreeContentType) {
        this.channelLevelThreeContentType = channelLevelThreeContentType;
    }

    public DocType getChannelLevelFourContentType() {
        return channelLevelFourContentType;
    }

    public SiteChannel channelLevelFourContentType(DocType channelLevelFourContentType) {
        this.channelLevelFourContentType = channelLevelFourContentType;
        return this;
    }

    public void setChannelLevelFourContentType(DocType channelLevelFourContentType) {
        this.channelLevelFourContentType = channelLevelFourContentType;
    }

    public Boolean isChannelAllowExternalUrl() {
        return channelAllowExternalUrl;
    }

    public SiteChannel channelAllowExternalUrl(Boolean channelAllowExternalUrl) {
        this.channelAllowExternalUrl = channelAllowExternalUrl;
        return this;
    }

    public void setChannelAllowExternalUrl(Boolean channelAllowExternalUrl) {
        this.channelAllowExternalUrl = channelAllowExternalUrl;
    }

    public String getChannelLogo() {
        return channelLogo;
    }

    public SiteChannel channelLogo(String channelLogo) {
        this.channelLogo = channelLogo;
        return this;
    }

    public void setChannelLogo(String channelLogo) {
        this.channelLogo = channelLogo;
    }

    public String getChannelSiteName() {
        return channelSiteName;
    }

    public SiteChannel channelSiteName(String channelSiteName) {
        this.channelSiteName = channelSiteName;
        return this;
    }

    public void setChannelSiteName(String channelSiteName) {
        this.channelSiteName = channelSiteName;
    }

    public String getLogo() {
        return logo;
    }

    public SiteChannel logo(String logo) {
        this.logo = logo;
        return this;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getSiteName() {
        return siteName;
    }

    public SiteChannel siteName(String siteName) {
        this.siteName = siteName;
        return this;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public ChannelType getChannelType() {
        return channelType;
    }

    public SiteChannel channelType(ChannelType channelType) {
        this.channelType = channelType;
        return this;
    }

    public void setChannelType(ChannelType channelType) {
        this.channelType = channelType;
    }

    public FetchEngine getLevelOneFetchEngine() {
        return levelOneFetchEngine;
    }

    public SiteChannel levelOneFetchEngine(FetchEngine levelOneFetchEngine) {
        this.levelOneFetchEngine = levelOneFetchEngine;
        return this;
    }

    public void setLevelOneFetchEngine(FetchEngine levelOneFetchEngine) {
        this.levelOneFetchEngine = levelOneFetchEngine;
    }

    public FetchEngine getLevelTwoFetchEngine() {
        return levelTwoFetchEngine;
    }

    public SiteChannel levelTwoFetchEngine(FetchEngine levelTwoFetchEngine) {
        this.levelTwoFetchEngine = levelTwoFetchEngine;
        return this;
    }

    public void setLevelTwoFetchEngine(FetchEngine levelTwoFetchEngine) {
        this.levelTwoFetchEngine = levelTwoFetchEngine;
    }

    public FetchEngine getLevelThreeFetchEngine() {
        return levelThreeFetchEngine;
    }

    public SiteChannel levelThreeFetchEngine(FetchEngine levelThreeFetchEngine) {
        this.levelThreeFetchEngine = levelThreeFetchEngine;
        return this;
    }

    public void setLevelThreeFetchEngine(FetchEngine levelThreeFetchEngine) {
        this.levelThreeFetchEngine = levelThreeFetchEngine;
    }

    public FetchEngine getLevelFourFetchEngine() {
        return levelFourFetchEngine;
    }

    public SiteChannel levelFourFetchEngine(FetchEngine levelFourFetchEngine) {
        this.levelFourFetchEngine = levelFourFetchEngine;
        return this;
    }

    public void setLevelFourFetchEngine(FetchEngine levelFourFetchEngine) {
        this.levelFourFetchEngine = levelFourFetchEngine;
    }

    public DocType getLevelOneContentType() {
        return levelOneContentType;
    }

    public SiteChannel levelOneContentType(DocType levelOneContentType) {
        this.levelOneContentType = levelOneContentType;
        return this;
    }

    public void setLevelOneContentType(DocType levelOneContentType) {
        this.levelOneContentType = levelOneContentType;
    }

    public DocType getLevelTwoContentType() {
        return levelTwoContentType;
    }

    public SiteChannel levelTwoContentType(DocType levelTwoContentType) {
        this.levelTwoContentType = levelTwoContentType;
        return this;
    }

    public void setLevelTwoContentType(DocType levelTwoContentType) {
        this.levelTwoContentType = levelTwoContentType;
    }

    public DocType getLevelThreeContentType() {
        return levelThreeContentType;
    }

    public SiteChannel levelThreeContentType(DocType levelThreeContentType) {
        this.levelThreeContentType = levelThreeContentType;
        return this;
    }

    public void setLevelThreeContentType(DocType levelThreeContentType) {
        this.levelThreeContentType = levelThreeContentType;
    }

    public DocType getLevelFourContentType() {
        return levelFourContentType;
    }

    public SiteChannel levelFourContentType(DocType levelFourContentType) {
        this.levelFourContentType = levelFourContentType;
        return this;
    }

    public void setLevelFourContentType(DocType levelFourContentType) {
        this.levelFourContentType = levelFourContentType;
    }

    public Boolean isAllowExternalUrl() {
        return allowExternalUrl;
    }

    public SiteChannel allowExternalUrl(Boolean allowExternalUrl) {
        this.allowExternalUrl = allowExternalUrl;
        return this;
    }

    public void setAllowExternalUrl(Boolean allowExternalUrl) {
        this.allowExternalUrl = allowExternalUrl;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public SiteChannel siteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
        return this;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public TargetChannel getTargetChannel() {
        return targetChannel;
    }

    public SiteChannel targetChannel(TargetChannel targetChannel) {
        this.targetChannel = targetChannel;
        return this;
    }

    public void setTargetChannel(TargetChannel targetChannel) {
        this.targetChannel = targetChannel;
    }

    public TargetChannel getTarget() {
        return target;
    }

    public SiteChannel target(TargetChannel target) {
        this.target = target;
        return this;
    }

    public void setTarget(TargetChannel target) {
        this.target = target;
    }

    public String getSiteDomain() {
        return siteDomain;
    }

    public SiteChannel siteDomain(String siteDomain) {
        this.siteDomain = siteDomain;
        return this;
    }

    public void setSiteDomain(String siteDomain) {
        this.siteDomain = siteDomain;
    }

    public Set<ChannelOuterLink> getOuters() {
        return outers;
    }

    public SiteChannel outers(Set<ChannelOuterLink> channelOuterLinks) {
        this.outers = channelOuterLinks;
        return this;
    }

    public SiteChannel addOuter(ChannelOuterLink channelOuterLink) {
        this.outers.add(channelOuterLink);
        return this;
    }

    public SiteChannel removeOuter(ChannelOuterLink channelOuterLink) {
        this.outers.remove(channelOuterLink);
        return this;
    }

    public void setOuters(Set<ChannelOuterLink> channelOuterLinks) {
        this.outers = channelOuterLinks;
    }

    public Set<ConfigMapping> getMappings() {
        return mappings;
    }

    public SiteChannel mappings(Set<ConfigMapping> configMappings) {
        this.mappings = configMappings;
        return this;
    }

    public SiteChannel addMapping(ConfigMapping configMapping) {
        this.mappings.add(configMapping);
        return this;
    }

    public SiteChannel removeMapping(ConfigMapping configMapping) {
        this.mappings.remove(configMapping);
        return this;
    }

    public void setMappings(Set<ConfigMapping> configMappings) {
        this.mappings = configMappings;
    }

    public Set<ConfigGroup> getConfigGroups() {
        return configGroups;
    }

    public SiteChannel configGroups(Set<ConfigGroup> configGroups) {
        this.configGroups = configGroups;
        return this;
    }

    public SiteChannel addConfigGroup(ConfigGroup configGroup) {
        this.configGroups.add(configGroup);
        return this;
    }

    public SiteChannel removeConfigGroup(ConfigGroup configGroup) {
        this.configGroups.remove(configGroup);
        return this;
    }

    public void setConfigGroups(Set<ConfigGroup> configGroups) {
        this.configGroups = configGroups;
    }

    public Set<ConfigGroup> getTargetGroups() {
        return targetGroups;
    }

    public SiteChannel targetGroups(Set<ConfigGroup> configGroups) {
        this.targetGroups = configGroups;
        return this;
    }

    public SiteChannel addTargetGroup(ConfigGroup configGroup) {
        this.targetGroups.add(configGroup);
        return this;
    }

    public SiteChannel removeTargetGroup(ConfigGroup configGroup) {
        this.targetGroups.remove(configGroup);
        return this;
    }

    public void setTargetGroups(Set<ConfigGroup> configGroups) {
        this.targetGroups = configGroups;
    }
    // simlife-needle-entity-add-getters-setters - Simlife will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SiteChannel siteChannel = (SiteChannel) o;
        if (siteChannel.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), siteChannel.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "SiteChannel{" +
            "id=" + getId() +
            ", url='" + getUrl() + "'" +
            ", contentType='" + getContentType() + "'" +
            ", schedule='" + getSchedule() + "'" +
            ", scheduleTimeZone='" + getScheduleTimeZone() + "'" +
            ", totalLevel=" + getTotalLevel() +
            ", archiveLevel=" + getArchiveLevel() +
            ", unlimitedLevel='" + isUnlimitedLevel() + "'" +
            ", fetchEngine='" + getFetchEngine() + "'" +
            ", category='" + getCategory() + "'" +
            ", tag='" + getTag() + "'" +
            ", categorySlug='" + getCategorySlug() + "'" +
            ", tagSlug='" + getTagSlug() + "'" +
            ", countryCode='" + getCountryCode() + "'" +
            ", languageCode='" + getLanguageCode() + "'" +
            ", targetQueueChannel='" + getTargetQueueChannel() + "'" +
            ", topics='" + getTopics() + "'" +
            ", topicSlugs='" + getTopicSlugs() + "'" +
            ", postType='" + getPostType() + "'" +
            ", rankingCountry=" + getRankingCountry() +
            ", channelTotalLevel=" + getChannelTotalLevel() +
            ", channelArchiveLevel=" + getChannelArchiveLevel() +
            ", channelFetchEngine='" + getChannelFetchEngine() + "'" +
            ", channelRanking=" + getChannelRanking() +
            ", channelTargetQueue='" + getChannelTargetQueue() + "'" +
            ", channelTargetPostType='" + getChannelTargetPostType() + "'" +
            ", channelLevelOneFetchEngine='" + getChannelLevelOneFetchEngine() + "'" +
            ", channelLevelTwoFetchEngine='" + getChannelLevelTwoFetchEngine() + "'" +
            ", channelLevelThreeFetchEngine='" + getChannelLevelThreeFetchEngine() + "'" +
            ", channelLevelFourFetchEngine='" + getChannelLevelFourFetchEngine() + "'" +
            ", channelLevelOneContentType='" + getChannelLevelOneContentType() + "'" +
            ", channelLevelTwoContentType='" + getChannelLevelTwoContentType() + "'" +
            ", channelLevelThreeContentType='" + getChannelLevelThreeContentType() + "'" +
            ", channelLevelFourContentType='" + getChannelLevelFourContentType() + "'" +
            ", channelAllowExternalUrl='" + isChannelAllowExternalUrl() + "'" +
            ", channelLogo='" + getChannelLogo() + "'" +
            ", channelSiteName='" + getChannelSiteName() + "'" +
            ", logo='" + getLogo() + "'" +
            ", siteName='" + getSiteName() + "'" +
            ", channelType='" + getChannelType() + "'" +
            ", levelOneFetchEngine='" + getLevelOneFetchEngine() + "'" +
            ", levelTwoFetchEngine='" + getLevelTwoFetchEngine() + "'" +
            ", levelThreeFetchEngine='" + getLevelThreeFetchEngine() + "'" +
            ", levelFourFetchEngine='" + getLevelFourFetchEngine() + "'" +
            ", levelOneContentType='" + getLevelOneContentType() + "'" +
            ", levelTwoContentType='" + getLevelTwoContentType() + "'" +
            ", levelThreeContentType='" + getLevelThreeContentType() + "'" +
            ", levelFourContentType='" + getLevelFourContentType() + "'" +
            ", allowExternalUrl='" + isAllowExternalUrl() + "'" +
            ", siteUrl='" + getSiteUrl() + "'" +
            ", targetChannel='" + getTargetChannel() + "'" +
            ", target='" + getTarget() + "'" +
            ", siteDomain='" + getSiteDomain() + "'" +
            "}";
    }
}
