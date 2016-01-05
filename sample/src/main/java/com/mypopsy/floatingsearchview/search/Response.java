package com.mypopsy.floatingsearchview.search;

public class Response {

    public HatewaMk get_embedded() {
        return _embedded;
    }

    public void set_embedded(HatewaMk _embedded) {
        this._embedded = _embedded;
    }

    public HatewaMk _embedded;

    public class HatewaMk{
        public SearchResult[] getTopics() {
            return topics;
        }

        public void setTopics(SearchResult[] topics) {
            this.topics = topics;
        }

        private SearchResult[] topics;
    }
}
