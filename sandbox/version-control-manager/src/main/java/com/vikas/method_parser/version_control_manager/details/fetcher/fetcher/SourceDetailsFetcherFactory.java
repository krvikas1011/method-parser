package com.vikas.method_parser.version_control_manager.details.fetcher.fetcher;

import com.vikas.method_parser.version_control_manager.details.fetcher.model.UserInput;

/**
 * Factory to return the instance of {@link SourceDetailsFetcher} based on user input.
 *
 */
public class SourceDetailsFetcherFactory {
    public static SourceDetailsFetcher getSourceDetailsFetcher(UserInput userInput){
        // Todo: Correct instance return logic will need to be implemented.
        return new OrgDetailsFetcher();
    }
}
