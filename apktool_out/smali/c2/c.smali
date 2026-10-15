.class public final Lc2/c;
.super Lc3/h;
.source "SourceFile"


# instance fields
.field public final synthetic j:Landroid/content/Context;

.field public final synthetic k:Landroid/text/TextPaint;

.field public final synthetic l:Lc3/h;

.field public final synthetic m:Lc2/d;


# direct methods
.method public constructor <init>(Lc2/d;Landroid/content/Context;Landroid/text/TextPaint;Lc3/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/c;->m:Lc2/d;

    iput-object p2, p0, Lc2/c;->j:Landroid/content/Context;

    iput-object p3, p0, Lc2/c;->k:Landroid/text/TextPaint;

    iput-object p4, p0, Lc2/c;->l:Lc3/h;

    return-void
.end method


# virtual methods
.method public final G1(I)V
    .locals 1

    iget-object v0, p0, Lc2/c;->l:Lc3/h;

    invoke-virtual {v0, p1}, Lc3/h;->G1(I)V

    return-void
.end method

.method public final I1(Landroid/graphics/Typeface;Z)V
    .locals 3

    iget-object v0, p0, Lc2/c;->k:Landroid/text/TextPaint;

    iget-object v1, p0, Lc2/c;->m:Lc2/d;

    iget-object v2, p0, Lc2/c;->j:Landroid/content/Context;

    invoke-virtual {v1, v2, v0, p1}, Lc2/d;->g(Landroid/content/Context;Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    iget-object v0, p0, Lc2/c;->l:Lc3/h;

    invoke-virtual {v0, p1, p2}, Lc3/h;->I1(Landroid/graphics/Typeface;Z)V

    return-void
.end method
