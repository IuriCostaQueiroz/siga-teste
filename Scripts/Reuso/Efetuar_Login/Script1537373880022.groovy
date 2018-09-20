import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Acessar Siga'
WebUI.openBrowser('http://vali.tjba.jus.br:18985/siganovo/#/login')

'Preencher campo de usuário.'
WebUI.setText(findTestObject('Tela_Login/campo_texto_Login'), findTestData('Login').getValue('usuario', 1), FailureHandling.STOP_ON_FAILURE)

'Preencher campo de senha.'
WebUI.setText(findTestObject('Tela_Login/campo_texto_Senha'), findTestData('Login').getValue('senha', 1))

'Clicar no botão Entrar.'
WebUI.click(findTestObject('Tela_Login/botao_Entrar'))

WebUI.verifyElementPresent(findTestObject('Dashboard/confirma_tela_Dashboard'), 0)

WebUI.mouseOver(findTestObject('Geral/menu_Documentos'))

WebUI.waitForElementVisible(findTestObject('Geral/submenu_Novo'), 0)

WebUI.click(findTestObject('Geral/submenu_Novo'))

