.class public final Ly0/o1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lp/e;


# instance fields
.field public a:I

.field public b:Ly0/k0;

.field public c:Ly0/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lp/e;

    const/16 v1, 0x14

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lp/e;-><init>(II)V

    sput-object v0, Ly0/o1;->d:Lp/e;

    return-void
.end method

.method public static a()Ly0/o1;
    .locals 1

    sget-object v0, Ly0/o1;->d:Lp/e;

    invoke-virtual {v0}, Lp/e;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly0/o1;

    if-nez v0, :cond_0

    new-instance v0, Ly0/o1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :cond_0
    return-object v0
.end method
