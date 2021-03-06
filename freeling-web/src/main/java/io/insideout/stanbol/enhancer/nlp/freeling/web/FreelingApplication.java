package io.insideout.stanbol.enhancer.nlp.freeling.web;

import io.insideout.stanbol.enhancer.nlp.freeling.web.reader.BlobReader;
import io.insideout.stanbol.enhancer.nlp.freeling.web.resource.AnalysisResource;
import io.insideout.stanbol.enhancer.nlp.freeling.web.resource.LangIdentResource;
import io.insideout.stanbol.enhancer.nlp.freeling.web.resource.MainResource;
import io.insideout.stanbol.enhancer.nlp.freeling.web.writer.DetectedLanguageWriter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.apache.stanbol.enhancer.nlp.json.writer.AnalyzedTextWriter;

public class FreelingApplication extends Application {
    
    @Override
    @SuppressWarnings("unchecked")
    public Set<Class<?>> getClasses() {
        return new HashSet<Class<?>>(Arrays.asList(
            AnalyzedTextWriter.class, DetectedLanguageWriter.class,
            BlobReader.class, MainResource.class,
            AnalysisResource.class, LangIdentResource.class));
    }

}
