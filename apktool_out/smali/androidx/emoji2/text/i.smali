.class public abstract Landroidx/emoji2/text/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/emoji2/text/l;

.field public b:I

.field public final c:Landroidx/emoji2/text/f;


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/l;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/emoji2/text/i;->b:I

    new-instance v0, Landroidx/emoji2/text/f;

    invoke-direct {v0}, Landroidx/emoji2/text/f;-><init>()V

    iput-object v0, p0, Landroidx/emoji2/text/i;->c:Landroidx/emoji2/text/f;

    iput-object p1, p0, Landroidx/emoji2/text/i;->a:Landroidx/emoji2/text/l;

    return-void
.end method
