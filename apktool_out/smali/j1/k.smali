.class public final synthetic Lj1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lj1/l;

.field public final synthetic c:Z

.field public final synthetic d:Landroid/content/Context;

.field public final synthetic e:Landroid/net/Uri;

.field public final synthetic f:Lcom/auth0/android/request/internal/m;

.field public final synthetic g:Lj1/f;


# direct methods
.method public synthetic constructor <init>(Lj1/l;ZLandroid/content/Context;Landroid/net/Uri;Lcom/auth0/android/request/internal/b;Lj1/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj1/k;->b:Lj1/l;

    iput-boolean p2, p0, Lj1/k;->c:Z

    iput-object p3, p0, Lj1/k;->d:Landroid/content/Context;

    iput-object p4, p0, Lj1/k;->e:Landroid/net/Uri;

    iput-object p5, p0, Lj1/k;->f:Lcom/auth0/android/request/internal/m;

    iput-object p6, p0, Lj1/k;->g:Lj1/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lj1/k;->b:Lj1/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v1, p0, Lj1/k;->c:Z

    iget-object v2, p0, Lj1/k;->d:Landroid/content/Context;

    iget-object v3, p0, Lj1/k;->e:Landroid/net/Uri;

    if-eqz v1, :cond_0

    :try_start_0
    iget-object v1, v0, Lj1/l;->f:Ll2/g;

    iget-object v0, v0, Lj1/l;->g:Lj1/m;

    invoke-virtual {v0, v2, v3}, Lj1/m;->b(Landroid/content/Context;Landroid/net/Uri;)Lm/f;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll2/g;->a(Lm/f;)V

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v2, v3}, Lj1/l;->c(Landroid/content/Context;Landroid/net/Uri;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :goto_0
    new-instance v1, Lg1/c;

    const-string v2, "An error occurred when trying to authenticate with the server."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v0, "a0.browser_not_available"

    iput-object v0, v1, Lg1/c;->b:Ljava/lang/String;

    const-string v0, "Error launching browser for authentication"

    iput-object v0, v1, Lg1/c;->c:Ljava/lang/String;

    new-instance v0, Le/k0;

    const/4 v2, 0x3

    iget-object v3, p0, Lj1/k;->g:Lj1/f;

    invoke-direct {v0, v3, v2, v1}, Le/k0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    iget-object v1, p0, Lj1/k;->f:Lcom/auth0/android/request/internal/m;

    invoke-interface {v1, v0}, Lcom/auth0/android/request/internal/m;->b(Le/k0;)V

    goto :goto_1

    :catch_1
    const-string v0, "l"

    const-string v1, "Could not find any Browser application installed in this device to handle the intent."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    return-void
.end method
