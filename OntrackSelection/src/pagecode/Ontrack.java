/**
 * 
 */
package pagecode;

import javax.faces.component.html.HtmlForm;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.component.html.HtmlOutputText;

/**
 * @author jeffreyStern
 *
 */
public class Ontrack extends PageCodeBase {

	protected HtmlForm form1;
	protected HtmlPanelGrid panel;
	protected HtmlOutputText cHeader;
	protected HtmlForm getForm1() {
		if (form1 == null) {
			form1 = (HtmlForm) findComponentInRoot("form1");
		}
		return form1;
	}
	protected HtmlPanelGrid getPanel() {
		if (panel == null) {
			panel = (HtmlPanelGrid) findComponentInRoot("panel");
		}
		return panel;
	}

}