package br.com.cwi.automation_training.pages.treinamento;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.cwi.automation_training.pages.BasePage;

public class TreinamentoElementMap extends BasePage {

	protected WebElement search_query_top;
	
	@FindBy(css = ".button-search")
	protected WebElement botaoPesquisar;
	
	@FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	protected WebElement botaoAdd;	
	
	@FindBy(xpath = "//*[@id='best-sellers_block_right']/div/ul/li[1]/a/img")
	protected WebElement vestido;	
	
	@FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[2]/span/span")
	protected WebElement caixaProduto;
	
	@FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[1]/h2")
	protected WebElement texto;
		
}