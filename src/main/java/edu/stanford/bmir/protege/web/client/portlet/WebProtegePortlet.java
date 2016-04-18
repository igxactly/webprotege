package edu.stanford.bmir.protege.web.client.portlet;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import edu.stanford.bmir.protege.web.shared.HasDispose;
import edu.stanford.protege.widgetmap.client.view.HasViewTitle;
import edu.stanford.protege.widgetmap.client.view.HasViewTitleChangedHandlers;

/**
 * A WebProtegePortlet is basically a presenter (as in Model View Presenter) that contains the logic for displaying
 * some part of a project in the WebProtege user interface.  The displayed content is typically tied to the selection
 * with different content being displayed for different selected entities.
 */
public interface WebProtegePortlet extends IsWidget, HasDispose, HasViewTitleChangedHandlers, HasViewTitle, HasPortletActions {

    AcceptsOneWidget getContentHolder();

    void setToolbarVisible(boolean visible);

    void setTitle(String title);
}