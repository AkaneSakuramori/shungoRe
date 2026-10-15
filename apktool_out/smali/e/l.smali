.class public final Le/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb/b;


# instance fields
.field public final synthetic a:Le/m;


# direct methods
.method public constructor <init>(Le/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/l;->a:Le/m;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Le/l;->a:Le/m;

    invoke-virtual {v0}, Le/m;->l()Le/r;

    move-result-object v1

    invoke-virtual {v1}, Le/r;->a()V

    iget-object v0, v0, Landroidx/activity/n;->f:Lz0/f;

    iget-object v0, v0, Lz0/f;->b:Lz0/e;

    const-string v2, "androidx:appcompat"

    invoke-virtual {v0, v2}, Lz0/e;->a(Ljava/lang/String;)Landroid/os/Bundle;

    invoke-virtual {v1}, Le/r;->f()V

    return-void
.end method
