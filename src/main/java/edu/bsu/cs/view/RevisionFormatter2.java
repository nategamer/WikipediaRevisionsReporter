package edu.bsu.cs.view;

import edu.bsu.cs.model.Revision;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class RevisionFormatter2 implements RevisionInterface {
    @Override
    public String format(Revision revision) {
        return String.format("Changed by %s, at %s", revision.name, DateTimeFormatter.ofPattern("HH:mm:ss MM-dd-yyyy ").withZone(ZoneId.from(ZoneOffset.UTC)).format(revision.timestamp));
    }
}
