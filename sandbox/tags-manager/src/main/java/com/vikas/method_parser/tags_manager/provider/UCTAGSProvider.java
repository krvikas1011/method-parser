package com.vikas.method_parser.tags_manager.provider;

import com.vikas.method_parser.tags_manager.uctags.UCTAGSCommandBuilder;
import com.vikas.method_parser.tags_manager.uctags.UCTAGSManager;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UCTAGSProvider implements TagsProvider {

  @Override
  public List<String> getTags(String languageFilter, Path pathToSourceCode) {
    UCTAGSManager.setup();
    String commandToGenerateTags =
        UCTAGSCommandBuilder.getCommand(languageFilter, pathToSourceCode);
    String commandOutput = CommandRunner.runCommandAndReturnOutput(commandToGenerateTags);
    assert commandOutput != null;
    return new ArrayList<>(Arrays.asList(commandOutput.split("\n")));
  }
}
