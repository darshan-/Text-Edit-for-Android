package org.paulmach.textedit.n001;

import android.content.SearchRecentSuggestionsProvider;

/* SearchSuggestions
 * 		Pretty simple to provide search suggestions */
public class SearchSuggestions extends SearchRecentSuggestionsProvider {
    public final static String AUTHORITY = "org.paulmach.authority.n001";
    public final static int MODE = DATABASE_MODE_QUERIES;

    public SearchSuggestions() {
        setupSuggestions(AUTHORITY, MODE);
    }
} // end class SearchSuggestions
