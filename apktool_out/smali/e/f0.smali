.class public final synthetic Le/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li0/l;


# instance fields
.field public final synthetic b:Le/j;


# direct methods
.method public synthetic constructor <init>(Le/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f0;->b:Le/j;

    return-void
.end method


# virtual methods
.method public final f(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Le/f0;->b:Le/j;

    invoke-virtual {v0, p1}, Le/j;->w(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
