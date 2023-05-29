@productAttribute
Feature: Effacer des attributs d un Produit
  En tant que utilisateur je souhaite effacer des attributs d un Produit

  Background: 
		Given Je me connecte sur l application Nopcommerce
    When Je saisis le username "admin@yourstore.com"
    And Je saisis le mot le passe "admin"
    And Je clique sur le bouton LOGIN

  @deletAttribute
  Scenario: Suppression d un attribut d un produit
   	When Je clique sur Catalog
    When Je clique sur Attributes
    When Je clique sur Product attributes
    When Je selectionne la case a cocher Color
    Then Je verifie que la case color a ete cochee
    When Je selectionne la case a cocher HDD
    When Je clique sur le bouton Delete
    Then Je verifie que les attribut sont effacee