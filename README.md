# TodoRepository
Todo web application with Spring Boot

使用した技術要素... 仕様書と同様

全体の設計・構成についての説明+現状の説明...
今回JavaとMySQLをほぼ初めて触れたため、データベースの取り扱いとツールの基礎に苦戦しております。そのため現状の機能としてはlocalhostに接続するとControllerからindex.html(Todoリストのトップ画面)が呼び出されるのみとなっています。また、DependenciesでMySQLを指定すると接続が失敗するためにRunができず、現状ではMySQLをDependenciesから外しています。
POST送信でTodoリストを受け取りSQLに保存し、表示するという機能の実装がまだできていません。今後、学習と実装を進めていく所存です。

開発環境のセットアップ手順...
Eclipse,Java,MySQLのDL, MYSQLのローカル環境でのセットアップ、Eclipse内でのSTS,Gradleのインストール

進捗が思わしくなく、申し訳ありません。よろしくお願いいたします。
