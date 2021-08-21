package de.fernuni.studium.thomasworm.gitlabadoshook;

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import org.springframework.stereotype.Service;

@Service
public class CommitMessageParser {

    private static final Pattern azureBoardIdRegEx = Pattern.compile("AB#([0-9]+)");

    public ArrayList<Integer> getReferencedAzureBoardIds(String message) {
        ArrayList<Integer> ids = new ArrayList<Integer>();
        Matcher matcher = azureBoardIdRegEx.matcher(message);
        while(matcher.find()) {
            String idString = matcher.group(1);
            ids.add(Integer.parseInt(idString));
        }
        return ids;
    }

}