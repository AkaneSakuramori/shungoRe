.class public final Lf2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lf2/f;->a:F

    return-void
.end method


# virtual methods
.method public final a(Lf2/c;)Lf2/c;
    .locals 2

    instance-of v0, p1, Lf2/i;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lf2/b;

    iget v1, p0, Lf2/f;->a:F

    invoke-direct {v0, v1, p1}, Lf2/b;-><init>(FLf2/c;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method
