package com.vikas.method_parser.tags_manager.generator;

import com.vikas.method_parser.tags_manager.language_filter.LanguageFilter;
import com.vikas.method_parser.tags_manager.language_filter.LanguageFilterFactory;
import com.vikas.method_parser.tags_manager.model.Language;
import com.vikas.method_parser.tags_manager.model.Tag;
import com.vikas.method_parser.tags_manager.provider.UnifiedTagsProvider;

import java.nio.file.Path;
import java.util.List;

public class TagsGeneratorImpl implements TagsGenerator{
    public List<Tag> generateTags(Path pathToSourceCode, List<Language> languages) {
        LanguageFilter languageFilter = LanguageFilterFactory.getLanguageFilter();
        languageFilter.createFilter(languages);
//        C:\combined_folder\ctags_old\ctags -R --languages=java,python "C:\combined_folder"
        UnifiedTagsProvider unifiedTagsProvider = new UnifiedTagsProvider();
        unifiedTagsProvider.getUnifiedTags(languageFilter);
        return null;
    }
}
