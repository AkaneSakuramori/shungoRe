.class public final Lm/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:Ll/c;

.field public final c:Lf2/e;


# direct methods
.method public constructor <init>(Landroid/net/Uri;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ll/c;

    invoke-direct {v0}, Ll/c;-><init>()V

    iput-object v0, p0, Lm/f;->b:Ll/c;

    new-instance v0, Lf2/e;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lf2/e;-><init>(I)V

    iput-object v0, p0, Lm/f;->c:Lf2/e;

    iput-object p1, p0, Lm/f;->a:Landroid/net/Uri;

    return-void
.end method
