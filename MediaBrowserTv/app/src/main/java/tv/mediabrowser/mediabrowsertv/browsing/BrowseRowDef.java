package tv.mediabrowser.mediabrowsertv.browsing;

import mediabrowser.model.livetv.LiveTvChannelQuery;
import mediabrowser.model.livetv.ProgramQuery;
import mediabrowser.model.livetv.RecommendedProgramQuery;
import mediabrowser.model.livetv.RecordingQuery;
import mediabrowser.model.querying.ItemQuery;
import mediabrowser.model.querying.NextUpQuery;
import mediabrowser.model.querying.PersonsQuery;
import mediabrowser.model.querying.SeasonQuery;
import mediabrowser.model.querying.SimilarItemsQuery;
import mediabrowser.model.querying.UpcomingEpisodesQuery;
import tv.mediabrowser.mediabrowsertv.model.ChangeTriggerType;
import tv.mediabrowser.mediabrowsertv.querying.QueryType;
import tv.mediabrowser.mediabrowsertv.querying.ViewQuery;

/**
 * Created by Eric on 12/4/2014.
 */
public class BrowseRowDef {
    private String headerText;
    private ItemQuery query;
    private NextUpQuery nextUpQuery;
    private UpcomingEpisodesQuery upcomingQuery;
    private SimilarItemsQuery similarQuery;

    private PersonsQuery personsQuery;

    private LiveTvChannelQuery tvChannelQuery;
    private RecommendedProgramQuery programQuery;
    private RecordingQuery recordingQuery;

    private SeasonQuery seasonQuery;
    private QueryType queryType;

    private int chunkSize = 0;

    private ChangeTriggerType[] changeTriggers;

    public BrowseRowDef(String header, ItemQuery query, int chunkSize) {
        headerText = header;
        this.query = query;
        this.chunkSize = chunkSize;
        this.queryType = QueryType.Items;
    }

    public BrowseRowDef(String header, ItemQuery query, int chunkSize, ChangeTriggerType[] changeTriggers) {
        headerText = header;
        this.query = query;
        this.chunkSize = chunkSize;
        this.queryType = QueryType.Items;
        this.changeTriggers = changeTriggers;
    }

    public BrowseRowDef(String header, NextUpQuery query) {
        headerText = header;
        this.nextUpQuery = query;
        this.queryType = QueryType.NextUp;
    }

    public BrowseRowDef(String header, NextUpQuery query, ChangeTriggerType[] changeTriggers) {
        headerText = header;
        this.nextUpQuery = query;
        this.queryType = QueryType.NextUp;
        this.changeTriggers = changeTriggers;
    }

    public BrowseRowDef(String header, SimilarItemsQuery query) {
        headerText = header;
        this.similarQuery = query;
        this.queryType = QueryType.SimilarSeries;
    }

    public BrowseRowDef(String header, LiveTvChannelQuery query) {
        headerText = header;
        this.tvChannelQuery = query;
        this.queryType = QueryType.LiveTvChannel;
    }

    public BrowseRowDef(String header, RecommendedProgramQuery query) {
        headerText = header;
        this.programQuery = query;
        this.queryType = QueryType.LiveTvProgram;
    }

    public BrowseRowDef(String header, RecordingQuery query) {
        headerText = header;
        this.recordingQuery = query;
        this.queryType = QueryType.LiveTvRecording;
    }

    public BrowseRowDef(String header, PersonsQuery query, int chunkSize) {
        headerText = header;
        this.personsQuery = query;
        this.queryType = QueryType.Persons;
        this.chunkSize = chunkSize;
    }

    public BrowseRowDef(String header, SimilarItemsQuery query, QueryType type) {
        headerText = header;
        this.similarQuery = query;
        this.queryType = type;
    }

    public BrowseRowDef(String header, SeasonQuery query) {
        headerText = header;
        this.seasonQuery = query;
        this.queryType = QueryType.Season;
    }

    public BrowseRowDef(String header, UpcomingEpisodesQuery query) {
        headerText = header;
        this.upcomingQuery = query;
        this.queryType = QueryType.Upcoming;
    }

    public BrowseRowDef(String header, ViewQuery query) {
        headerText = header;
        this.queryType = QueryType.Views;
    }

    public int getChunkSize() {
        return chunkSize;
    }

    public String getHeaderText() {
        return headerText;
    }

    public void setHeaderText(String headerText) {
        this.headerText = headerText;
    }

    public ItemQuery getQuery() {
        return query;
    }

    public NextUpQuery getNextUpQuery() {
        return nextUpQuery;
    }

    public SimilarItemsQuery getSimilarQuery() { return similarQuery; }

    public QueryType getQueryType() {
        return queryType;
    }

    public SeasonQuery getSeasonQuery() { return seasonQuery; }

    public UpcomingEpisodesQuery getUpcomingQuery() {
        return upcomingQuery;
    }

    public LiveTvChannelQuery getTvChannelQuery() {
        return tvChannelQuery;
    }

    public RecommendedProgramQuery getProgramQuery() {
        return programQuery;
    }

    public RecordingQuery getRecordingQuery() { return recordingQuery; }


    public PersonsQuery getPersonsQuery() {
        return personsQuery;
    }

    public ChangeTriggerType[] getChangeTriggers() {
        return changeTriggers;
    }
}

