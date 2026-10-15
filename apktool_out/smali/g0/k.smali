.class public abstract Lg0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lg0/j;

.field public static final b:Lg0/j;

.field public static final c:Lg0/j;

.field public static final d:Lg0/j;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lg0/j;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lg0/j;-><init>(Lg0/g;Z)V

    sput-object v0, Lg0/k;->a:Lg0/j;

    new-instance v0, Lg0/j;

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lg0/j;-><init>(Lg0/g;Z)V

    sput-object v0, Lg0/k;->b:Lg0/j;

    new-instance v0, Lg0/j;

    sget-object v1, Lg0/g;->a:Lg0/g;

    invoke-direct {v0, v1, v2}, Lg0/j;-><init>(Lg0/g;Z)V

    sput-object v0, Lg0/k;->c:Lg0/j;

    new-instance v0, Lg0/j;

    invoke-direct {v0, v1, v3}, Lg0/j;-><init>(Lg0/g;Z)V

    sput-object v0, Lg0/k;->d:Lg0/j;

    return-void
.end method
