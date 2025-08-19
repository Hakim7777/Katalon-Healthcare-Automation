
# 🚀 Katalon Studio – UI Test Automation

[![Katalon](https://img.shields.io/badge/Katalon-Studio-green)](https://katalon.com/)  [![Groovy](https://img.shields.io/badge/Language-Groovy-blue)](https://groovy-lang.org/)  [![Java](https://img.shields.io/badge/Java-17-orange)](https://www.java.com/)  [![Jenkins](https://img.shields.io/badge/Jenkins-CI--CD-brightgreen)](#)  [![GitHub Actions](https://img.shields.io/badge/GitHub--Actions-CI-blue)](#)  [![License](https://img.shields.io/badge/License-MIT-yellow)](LICENSE)

---

> **Framework d’automatisation complet avec Katalon Studio**
> Inclut **UI Testing + API Testing**, exécutions data-driven, intégration CI/CD et rapports avancés.

---

## 📋 Table des matières

* 🔧 [Installation](#installation)
* ▶️ [Exécution des tests](#exécution-des-tests)
* 📂 [Structure du projet](#structure-du-projet)
* ✅ [Fonctionnalités testées](#fonctionnalités-testées)
* 📊 [Rapports & Intégration](#rapports--intégration)
* 🔄 [CI/CD intégré](#cicd-intégré)
* 🤝 [Contribuer](#contribuer)
* 📄 [Licence](#licence)
* 🔗 [Contact & LinkedIn](#contact--linkedin)

---

## 📂 Structure du projet

```
├── Test Cases/                 # Cas de test Katalon (UI + API)
├── Test Suites/                # Groupes de tests organisés
├── Test Suite Collections/     # Exécutions parallèles / multi-env
├── Object Repository/          # Objets UI (XPath, CSS…)
├── Data Files/                 # Données de test (CSV, Excel…)
├── Keywords/                   # Custom Keywords (Groovy)
├── Reports/                    # Rapports générés
├── Include/                    # Scripts utilitaires
├── Jenkinsfile                 # Pipeline CI/CD
└── README.md                   # Documentation du projet
```

---

## ✅ Fonctionnalités testées

| Module                | Description                         |
| --------------------- | ----------------------------------- |
| **Login**             | Authentification Admin/User         |
| **Employee CRUD**     | Ajouter / Modifier / Supprimer      |
| **Advanced Search**   | Recherche multi-critères            |
| **Import/Export**     | Gestion des fichiers (CSV/XLS)      |
| **Notifications**     | Vérification des alertes système    |
| **API Testing**       | Appels REST (GET/POST/PUT/DELETE)   |
| **Data-Driven Tests** | Paramétrés via CSV/Excel            |
| **Self-Healing**      | Localisation automatique des objets |

---

## 📊 Rapports & Intégration

* 📑 Rapports **JUnit / HTML / CSV / PDF**
* 📈 **Katalon TestOps** pour dashboards & analytics
* 📸 Screenshots automatiques en cas d’échec
* 🔍 Intégration avec **Allure Report** possible

---

## 🔄 CI/CD intégré

### ✅ GitHub Actions

* Exécution des tests en pipeline
* Génération & upload des rapports
* Fichier : `.github/workflows/katalon.yml`

### ✅ Jenkins

* Pipeline CI/CD avec `Jenkinsfile`
* Étapes principales :

  * Clone du repo
  * `katalonc -testSuitePath="..."`
  * Génération des rapports
  * Archivage screenshots & logs

---
## 📄 Licence

Projet sous licence MIT.
Voir [LICENSE](LICENSE) pour plus de détails.

---

## 🔗 Contact & LinkedIn

👤 [Abdelhakim SAHRAOUI](https://www.linkedin.com/in/hakim-alaoui-sahraoui-5a397a169/)
📧 [hakim.sahraoui.de@gmail.com](mailto:hakim.sahraoui.de@gmail.com)
