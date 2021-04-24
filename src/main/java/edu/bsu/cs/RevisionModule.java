package edu.bsu.cs;

import com.google.inject.AbstractModule;
import edu.bsu.cs.view.RevisionFormatter2;
import edu.bsu.cs.view.RevisionInterface;

public class RevisionModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(RevisionInterface.class).to(RevisionFormatter2.class);
    }
}
