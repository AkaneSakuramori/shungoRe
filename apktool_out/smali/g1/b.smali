.class public final Lg1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lf1/a;

.field public final b:Lcom/auth0/android/request/internal/l;

.field public final c:Lm2/m;


# direct methods
.method public constructor <init>(Lf1/a;)V
    .locals 5

    const-string v0, "auth0"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/auth0/android/request/internal/l;

    iget-object v1, p1, Lf1/a;->d:Lk1/a;

    sget-object v2, Lcom/auth0/android/request/internal/f;->a:Lm2/m;

    const-string v3, "gson"

    invoke-static {v2, v3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/auth0/android/request/internal/e;

    new-instance v4, Lcom/auth0/android/request/internal/GsonAdapter$Companion$forMap$1;

    invoke-direct {v4}, Lcom/auth0/android/request/internal/GsonAdapter$Companion$forMap$1;-><init>()V

    invoke-virtual {v2, v4}, Lm2/m;->c(Lcom/google/gson/reflect/TypeToken;)Lm2/b0;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/auth0/android/request/internal/e;-><init>(Lm2/b0;)V

    new-instance v4, Lg1/a;

    invoke-direct {v4, v3}, Lg1/a;-><init>(Lcom/auth0/android/request/internal/e;)V

    invoke-direct {v0, v1, v4}, Lcom/auth0/android/request/internal/l;-><init>(Lk1/a;Lg1/a;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/b;->a:Lf1/a;

    iput-object v0, p0, Lg1/b;->b:Lcom/auth0/android/request/internal/l;

    iput-object v2, p0, Lg1/b;->c:Lm2/m;

    iget-object p1, p1, Lf1/a;->c:Lm1/a;

    iget-object p1, p1, Lm1/a;->a:Ljava/lang/String;

    const-string v1, "clientInfo"

    invoke-static {p1, v1}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lcom/auth0/android/request/internal/l;->c:Ljava/util/LinkedHashMap;

    const-string v1, "Auth0-Client"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
