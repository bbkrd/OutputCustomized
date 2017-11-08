/* 
 * Copyright 2017 Deutsche Bundesbank
 * 
 * Licensed under the EUPL, Version 1.1 or – as soon they
 * will be approved by the European Commission - subsequent 
 * versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the
 * Licence.
 * You may obtain a copy of the Licence at:
 * 
 * http://ec.europa.eu/idabc/eupl.html
 * 
 * Unless required by applicable law or agreed to in
 * writing, software distributed under the Licence is
 * distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied.
 * See the Licence for the specific language governing
 * permissions and limitations under the Licence.
 */
package de.bbk.concurreport;

import ec.ui.view.AutoCorrelationsView;
import org.jfree.chart.JFreeChart;

/**
 *
 * @author s4504ch
 */
public class BbkAutoCorrelationsView extends AutoCorrelationsView {
    
    public BbkAutoCorrelationsView() {
        super();
    }
    
    public JFreeChart getChart() {
        return chartPanel.getChart();
    }
    
    public void extendTitle(String text) {
        String title = this.chartPanel.getChart().getTitle().getText() + text;
        this.chartPanel.getChart().getTitle().setText(title);
    }
    
}
