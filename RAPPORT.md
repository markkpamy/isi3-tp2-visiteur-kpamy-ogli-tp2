**Nom/Prénom Etudiant 1 :**

**Nom/Prénom Etudiant 2 :**

# Rapport TP2

## Question 1
*Insérer un schéma du patron de conception mis en place*
Expliquer le pattern avec un schéma
On utilise le pattern Visiteur
![diagramme classe](images/diagclasse.png)

## Question 2
*Expliquer le code ajouté*
On a crée une interface Visiteur où l'on implémente une méthode visit avec comme paramètre les différentes opérations
```JAVA
    public void visit(Multiplication multiplication);
    public void visit(Addition addition);
    public void visit(Constante constante);
    public void visit(Negation negation);
```
On a crée une interface Visitable avec la méthode accept qui prend en paramètre un visiteur 
```JAVA
    public void accept(Visiteur visiteur);
```
On fait hériter l'interface Noeud de l'interface Visitiable
```JAVA
public interface Noeud extends Visitable{}
```

On fait définit dans chaque classe d'opération arithmétique
```JAVA
	public void accept(Visiteur visiteur) {
		visiteur.visit(this);
	}
```

**On remarque que les méthodes visit pour les additions et les multiplications sont les mêmes donc nous préfèrons modifiers les méthodes visit**
```JAVA
	public void visit(OperateurBinaire operateurBinaire);
```

## Question 3
*Expliquer le code ajouté*
```JAVA
public void visit(Constante constante) {
        System.out.print(constante.getValeur());
    }

    public void visit(Negation negation) {
        negation.getOpG().accept(this);
        System.out.print(negation.getOp());
    }

    public void visit(OperateurBinaire operateurBinaire) {
        operateurBinaire.getOpG().accept(this);
        operateurBinaire.getOpD().accept(this);
        System.out.print(operateurBinaire.getOp());
    }
```

## Question 4
*Expliquer le code ajouté*

## Question 5
*Expliquer le code ajouté*

## Question 6
*Expliquer le code ajouté*