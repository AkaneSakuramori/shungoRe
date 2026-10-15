.class public final Lcom/auth0/android/request/internal/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/auth0/android/request/internal/m;


# static fields
.field public static final b:Lj1/y;

.field public static volatile c:Lcom/auth0/android/request/internal/b;


# instance fields
.field public final a:Lcom/auth0/android/request/internal/m;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lj1/y;

    const/16 v1, 0xc

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lj1/y;-><init>(II)V

    sput-object v0, Lcom/auth0/android/request/internal/b;->b:Lj1/y;

    return-void
.end method

.method public constructor <init>(Lcom/auth0/android/request/internal/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/auth0/android/request/internal/b;->a:Lcom/auth0/android/request/internal/m;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/auth0/android/request/internal/b;->a:Lcom/auth0/android/request/internal/m;

    invoke-interface {v0, p1}, Lcom/auth0/android/request/internal/m;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b(Le/k0;)V
    .locals 1

    iget-object v0, p0, Lcom/auth0/android/request/internal/b;->a:Lcom/auth0/android/request/internal/m;

    invoke-interface {v0, p1}, Lcom/auth0/android/request/internal/m;->b(Le/k0;)V

    return-void
.end method
