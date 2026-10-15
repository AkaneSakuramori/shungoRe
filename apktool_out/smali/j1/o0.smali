.class public final Lj1/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lf1/a;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public final d:Lj1/m;


# direct methods
.method public constructor <init>(Lf1/a;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj1/o0;->a:Lf1/a;

    const-string p1, "https"

    iput-object p1, p0, Lj1/o0;->b:Ljava/lang/String;

    new-instance p1, Lg0/a;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lg0/a;-><init>(I)V

    new-instance v0, Lj1/m;

    iget-boolean v1, p1, Lg0/a;->b:Z

    iget v2, p1, Lg0/a;->a:I

    iget-object p1, p1, Lg0/a;->c:Ljava/lang/Object;

    check-cast p1, Lj1/j;

    invoke-direct {v0, v1, v2, p1}, Lj1/m;-><init>(ZILj1/j;)V

    iput-object v0, p0, Lj1/o0;->d:Lj1/m;

    return-void
.end method


# virtual methods
.method public final a(Lcom/shungo/app/MainActivity;Landroidx/fragment/app/k;)V
    .locals 8

    const/4 v0, 0x0

    sput-object v0, Lj1/p0;->b:Lc3/h;

    iget-object v0, p0, Lj1/o0;->d:Lj1/m;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj1/m;->a(Landroid/content/pm/PackageManager;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lj1/o0;->c:Ljava/lang/String;

    iget-object v1, p0, Lj1/o0;->a:Lf1/a;

    if-nez v0, :cond_0

    iget-object v0, p0, Lj1/o0;->b:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v1, Lf1/a;->b:Lt3/s;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lc3/h;->M0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lj1/o0;->c:Ljava/lang/String;

    :cond_0
    new-instance v0, Lj1/w;

    iget-object v2, p0, Lj1/o0;->c:Ljava/lang/String;

    invoke-static {v2}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object v3, p0, Lj1/o0;->d:Lj1/m;

    invoke-direct {v0, v1, p2, v2, v3}, Lj1/w;-><init>(Lf1/a;Landroidx/fragment/app/k;Ljava/lang/String;Lj1/m;)V

    sput-object v0, Lj1/p0;->b:Lc3/h;

    iget-object p2, v0, Lj1/w;->m:Ljava/util/HashMap;

    iget-object v1, v0, Lj1/w;->j:Lf1/a;

    iget-object v2, v1, Lf1/a;->c:Lm1/a;

    iget-object v2, v2, Lm1/a;->a:Ljava/lang/String;

    const-string v3, "auth0Client"

    invoke-virtual {p2, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "client_id"

    iget-object v3, v1, Lf1/a;->a:Ljava/lang/String;

    invoke-interface {p2, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v1, Lf1/a;->b:Lt3/s;

    invoke-static {v1}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lt3/s;->f()Lt3/r;

    move-result-object v1

    const-string v3, "v2"

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v2, v1

    invoke-virtual/range {v2 .. v7}, Lt3/r;->d(Ljava/lang/String;IIZZ)V

    const-string v3, "logout"

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v2, v1

    invoke-virtual/range {v2 .. v7}, Lt3/r;->d(Ljava/lang/String;IIZZ)V

    invoke-virtual {v1}, Lt3/r;->b()Lt3/s;

    move-result-object v1

    iget-object v1, v1, Lt3/s;->h:Ljava/lang/String;

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v1

    invoke-virtual {p2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v3, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p2

    sget-object v1, Lj1/w;->o:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Using the following Logout URI: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, "uri"

    invoke-static {p2, v1}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, Lcom/auth0/android/provider/AuthenticationActivity;->d:I

    iget-boolean v1, v0, Lj1/w;->l:Z

    iget-object v0, v0, Lj1/w;->n:Lj1/m;

    invoke-static {p1, p2, v1, v0}, Lz0/c;->a(Lcom/shungo/app/MainActivity;Landroid/net/Uri;ZLj1/m;)V

    return-void

    :cond_2
    new-instance p1, Lg1/c;

    const-string v0, "a0.browser_not_available"

    const-string v1, "No compatible Browser application is installed."

    invoke-direct {p1, v0, v1}, Lg1/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Landroidx/fragment/app/k;->a(Lf1/b;)V

    return-void
.end method
