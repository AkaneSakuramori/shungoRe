.class public final Landroidx/fragment/app/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/fragment/app/g0;


# instance fields
.field public final a:I

.field public final b:I

.field public final synthetic c:Landroidx/fragment/app/i0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/i0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/h0;->c:Landroidx/fragment/app/i0;

    iput p2, p0, Landroidx/fragment/app/h0;->a:I

    const/4 p1, 0x1

    iput p1, p0, Landroidx/fragment/app/h0;->b:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 6

    iget-object v0, p0, Landroidx/fragment/app/h0;->c:Landroidx/fragment/app/i0;

    iget-object v0, v0, Landroidx/fragment/app/i0;->s:Landroidx/fragment/app/q;

    if-eqz v0, :cond_0

    iget v1, p0, Landroidx/fragment/app/h0;->a:I

    if-gez v1, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/q;->f()Landroidx/fragment/app/i0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/i0;->K()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/h0;->c:Landroidx/fragment/app/i0;

    const/4 v3, 0x0

    iget v4, p0, Landroidx/fragment/app/h0;->a:I

    iget v5, p0, Landroidx/fragment/app/h0;->b:I

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v5}, Landroidx/fragment/app/i0;->L(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;II)Z

    move-result p1

    return p1
.end method
