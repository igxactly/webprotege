package edu.stanford.bmir.protege.web.client.form;

import com.google.gwt.user.client.ui.IsWidget;
import edu.stanford.bmir.protege.web.client.ui.editor.ValueEditor;
import edu.stanford.bmir.protege.web.shared.form.Tuple;
import edu.stanford.bmir.protege.web.shared.form.field.ChoiceDescriptor;

import java.util.List;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 31/03/16
 */
public interface ChoiceFieldEditor extends IsWidget, ValueEditor<Tuple> {

    void setChoices(List<ChoiceDescriptor> choices);
}