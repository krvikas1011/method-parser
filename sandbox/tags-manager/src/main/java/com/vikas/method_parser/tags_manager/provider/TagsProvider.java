package com.vikas.method_parser.tags_manager.provider;

import com.vikas.method_parser.tags_manager.model.Tag;
import java.util.List;

public interface TagsProvider {
  List<Tag> getTags();
}
