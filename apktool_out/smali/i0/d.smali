.class public final Li0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li0/e;


# instance fields
.field public final b:Landroid/view/ContentInfo$Builder;


# direct methods
.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, p2}, Lc2/e;->e(Landroid/content/ClipData;I)Landroid/view/ContentInfo$Builder;

    move-result-object p1

    iput-object p1, p0, Li0/d;->b:Landroid/view/ContentInfo$Builder;

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Li0/d;->b:Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, Lc2/e;->k(Landroid/view/ContentInfo$Builder;Landroid/os/Bundle;)V

    return-void
.end method

.method public final b(Landroid/net/Uri;)V
    .locals 1

    iget-object v0, p0, Li0/d;->b:Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, Lc2/e;->j(Landroid/view/ContentInfo$Builder;Landroid/net/Uri;)V

    return-void
.end method

.method public final d()Li0/h;
    .locals 3

    new-instance v0, Li0/h;

    new-instance v1, Le/n0;

    iget-object v2, p0, Li0/d;->b:Landroid/view/ContentInfo$Builder;

    invoke-static {v2}, Lc2/e;->f(Landroid/view/ContentInfo$Builder;)Landroid/view/ContentInfo;

    move-result-object v2

    invoke-direct {v1, v2}, Le/n0;-><init>(Landroid/view/ContentInfo;)V

    invoke-direct {v0, v1}, Li0/h;-><init>(Li0/g;)V

    return-object v0
.end method

.method public final e(I)V
    .locals 1

    iget-object v0, p0, Li0/d;->b:Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, Lc2/e;->i(Landroid/view/ContentInfo$Builder;I)V

    return-void
.end method
