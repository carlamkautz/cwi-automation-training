package br.com.cwi.automation_training.pages.treinamento;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import br.com.cwi.automation_training.util.TestRule;

public class TreinamentoPage extends TreinamentoElementMap {

	public TreinamentoPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}	

	public void buscarProduto(String produto) {	
		search_query_top.sendKeys(produto);
		botaoPesquisar.click();
		logPrint("Buscou pelo produto " + produto);
	}
	public void botaoAddCarrinho(String botao) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 500)");	
		moveToElement(caixaProduto);
		waitElement(botaoAdd, 5).click();		
		
	}
	public void validar(String msg) {
		boolean apareceuTextoEsperado = texto.getText().contains(msg);	
		Assert.assertTrue(apareceuTextoEsperado);
		
		
	}
}