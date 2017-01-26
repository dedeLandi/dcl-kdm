/*
 * generated by Xtext
 */
package com.br.terra.dcl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import com.br.terra.dcl.services.DCLGrammarAccess;

public class DCLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private DCLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected com.br.terra.dcl.parser.antlr.internal.InternalDCLParser createParser(XtextTokenStream stream) {
		return new com.br.terra.dcl.parser.antlr.internal.InternalDCLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public DCLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DCLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
