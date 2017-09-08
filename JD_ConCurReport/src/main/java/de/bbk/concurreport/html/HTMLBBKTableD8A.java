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
package de.bbk.concurreport.html;

//import de.bbk.concur.util.TsData_MetaDataConverter;
import de.bbk.concur.util.JPanelCCA;
import de.bbk.concurreport.SVGJComponent;
import ec.tss.html.AbstractHtmlElement;
import ec.tss.html.HtmlStream;
import ec.tss.html.IHtmlElement;
import ec.tss.sa.documents.X13Document;
import java.io.IOException;

/**
 *
 * @author Christiane Hofer
 */
public class HTMLBBKTableD8A extends AbstractHtmlElement implements IHtmlElement {

    private final X13Document x13doc;

    public HTMLBBKTableD8A(X13Document x13doc) {
        this.x13doc = x13doc;
    }

    @Override
    public void write(HtmlStream stream) throws IOException {

        JPanelCCA jpcca = new JPanelCCA();
        jpcca.set(x13doc);

        SVGJComponent bBKTableD8B = new SVGJComponent(jpcca.getCCAPanel());
        bBKTableD8B.write(stream);

        stream.newLine();
    }
}
