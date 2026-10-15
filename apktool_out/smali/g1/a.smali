.class public final Lg1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/auth0/android/request/internal/e;


# direct methods
.method public constructor <init>(Lcom/auth0/android/request/internal/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/a;->a:Lcom/auth0/android/request/internal/e;

    return-void
.end method

.method public static a(Ljava/lang/Exception;)Lg1/c;
    .locals 3

    new-instance v0, Lg1/c;

    new-instance v1, Lf1/b;

    const-string v2, "Something went wrong"

    invoke-direct {v1, v2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v0, v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;Ljava/util/Map;)Lg1/c;
    .locals 1

    const-string v0, "headers"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lg1/c;

    invoke-direct {p1}, Lg1/c;-><init>()V

    const-string v0, "a0.sdk.internal_error.plain"

    iput-object v0, p1, Lg1/c;->b:Ljava/lang/String;

    iput-object p0, p1, Lg1/c;->c:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public final b(Ljava/io/InputStreamReader;)Lg1/c;
    .locals 5

    iget-object v0, p0, Lg1/a;->a:Lcom/auth0/android/request/internal/e;

    iget-object v0, v0, Lcom/auth0/android/request/internal/e;->a:Lm2/b0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lt2/b;

    invoke-direct {v1, p1}, Lt2/b;-><init>(Ljava/io/Reader;)V

    invoke-virtual {v0, v1}, Lm2/b0;->b(Lt2/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    new-instance v0, Lg1/c;

    const-string v1, "values"

    invoke-static {p1, v1}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Lg1/c;-><init>()V

    const-string v1, "error"

    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    :goto_0
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_1

    :cond_0
    const-string v1, "code"

    goto :goto_0

    :goto_1
    check-cast v1, Ljava/lang/String;

    const-string v2, "a0.sdk.internal_error.unknown"

    if-nez v1, :cond_1

    move-object v1, v2

    :cond_1
    iput-object v1, v0, Lg1/c;->b:Ljava/lang/String;

    const-string v3, "description"

    invoke-interface {p1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    const-string v1, "error_description"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, v0, Lg1/c;->c:Ljava/lang/String;

    iget-object p1, v0, Lg1/c;->b:Ljava/lang/String;

    if-eqz p1, :cond_2

    move-object v2, p1

    :cond_2
    const-string p1, "invalid_request"

    invoke-static {p1, v2}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {v0}, Lg1/c;->a()Ljava/lang/String;

    move-result-object p1

    const-string v1, "OIDC conformant clients cannot use /oauth/access_token"

    invoke-static {v1, p1}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {v0}, Lg1/c;->a()Ljava/lang/String;

    move-result-object p1

    const-string v1, "OIDC conformant clients cannot use /oauth/ro"

    invoke-static {v1, p1}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    :cond_3
    const-class p1, Lg1/b;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Your Auth0 Application is configured as \'OIDC Conformant\' but this instance it\'s not. To authenticate you will need to enable the flag by calling Auth0#setOIDCConformant(true) on the Auth0 instance you used in the setup."

    invoke-static {p1, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_4
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_5

    check-cast v2, Ljava/lang/String;

    iput-object v2, v0, Lg1/c;->c:Ljava/lang/String;

    goto :goto_2

    :cond_5
    instance-of v3, v2, Ljava/util/Map;

    if-eqz v3, :cond_6

    const-string v3, "invalid_password"

    invoke-static {v3, v1}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const-string v1, "name"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "PasswordStrengthError"

    invoke-static {v1, p1}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    new-instance p1, Lg1/e;

    check-cast v2, Ljava/util/Map;

    invoke-direct {p1, v2}, Lg1/e;-><init>(Ljava/util/Map;)V

    iget-object p1, p1, Lg1/e;->b:Ljava/lang/String;

    iput-object p1, v0, Lg1/c;->c:Ljava/lang/String;

    :cond_6
    :goto_2
    return-object v0
.end method
