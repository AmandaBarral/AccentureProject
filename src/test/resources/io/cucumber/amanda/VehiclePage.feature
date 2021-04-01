# language: pt

Funcionalidade: Acessar o site da Tricentis e preencher formulario de solicitacao de seguro
	Como usuario de veiculo
	Ele quer enviar os dados necessarios
	Para que possa ter um orcamento

	Cenario: Acessar o site da Tricentis e preencher o formulario da aba Enter Vehicle Data
    	Dado que o usuario acessa o site
		Quando o usuario clica no campo Make e seleciona 
		E o usuario clica no campo Model e seleciona 
		E o usuario clica no campo Cylinder Capacity e preenche
		E o usuario clica no campo Engine Performance e preenche
		E o usuario clica no campo Date of Manufacture e preenche
		E o usuario clica no campo Number of Seats 
		E o usuario clica no campo Right Hand Drive e seleciona
		E o usuario clica no campo Number of Seats e seleciona
		E o usuario clica no campo Fuel Type e seleciona
		E o usuario clica no campo Payload e preenche
		E o usuario clica no campo Total Weight e preenche
		E o usuario clica no campo List Price e preenche
		E o usuario clica no campo License Plate Number e preenche
		E o usuario clica no campo Annual Mileage e preenche
		Entao o usuario clica em Next e acessa a aba Enter Insurant Data

	Cenario: Preencher formulario da aba Enter Insurant Data
		Quando o usuario clica no campo First Name e completa
		E o usuario clica no campo Last Name e completa
		E o usuario clica no campo Date of Birth e completa
		E o usuario clica no campo Gender e seleciona
		E o usuario clica no campo Street Address e completa
		E o usuario clica no campo Country e seleciona
		E o usuario clica no campo Zip Code e completa
		E o usuario clica no campo City e completa
		E o usuario clica no campo Occupation e seleciona
		E o usuario clica no campo Hobbies e seleciona
		E o usuario clica no campo Website e completa
		E o usuario clica no campo Picture 
		Entao o usuario clica em Next e acessa a aba Enter Product Data

	Cenario: Preencher formulario da aba Enter Product Data
		Quando o usuario seleciona uma data Start Date
		E o usuario seleciona um valor de seguro Insurance Sum
		E o usuario escolhe uma nota Merit Rating
		E o usuario escolhe uma cobertura Damage Insurance
		E o usuario seleciona opcionais em Optional Products
		E o usuario seleciona uma cortesia em Courtesy Car
		Entao o usuario clica em next para ver a tabela de precos

	Cenario: Escolher tipo de Select Price Option
		Quando o usuario escolhe uma opcao 
		Entao o usuario clica em Next para receber orcamento

	Cenario: Preencher formulario da aba Send Quote
		Quando o usuario clica no campo Email e preenche
		E o usuario clica no campo Phone e preenche
		E o usuario clica no campo Username e preenche
		E o usuario clica no campo Password e preenche
		E o usuario clica no campo Confirm Password e preenche 
		E o usuario clica em Send
		Entao o usuario verifica a mensagem de sucesso "Sending e-mail success!"
		E o usuario clica no botao Ok
		
		

	
		