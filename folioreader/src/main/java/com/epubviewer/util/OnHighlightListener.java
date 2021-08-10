package com.epubviewer.util;

import com.epubviewer.model.HighLight;
import com.epubviewer.model.HighlightImpl;

/**
 * Interface to convey highlight events.
 *
 * @author gautam chibde on 26/9/17.
 */

public interface OnHighlightListener {

    /**
     * This method will be invoked when a highlight is created, deleted or modified.
     *
     * @param highlight meta-data for created highlight {@link HighlightImpl}.
     * @param type      type of event e.g new,edit or delete {@link com.epubviewer.model.HighlightImpl.HighLightAction}.
     */
    void onHighlight(HighLight highlight, HighLight.HighLightAction type);
}
