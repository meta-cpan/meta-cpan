DESCRIPTION = "This module provides an object-oriented abstraction on top of IP addresses \
or IP subnets that allows for easy manipulations. Version 4.xx of \
NetAddr::IP will work with older versions of Perl and is compatible with \
Math::BigInt."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv2+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/NetAddr-IP"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MI/MIKER/NetAddr-IP-4.078.tar.gz"

SRC_URI[md5sum] = "bca8406520b6535a3f9661d385705d97"
SRC_URI[sha256sum] = "b9a12294e58dcece0189630ddb6926e37169cbbb24c76091f1e604e426c19614"

S = "${WORKDIR}/NetAddr-IP-${PV}"

inherit cpan allarch

EXTRA_CPANFLAGS = "-noxs"

BBCLASSEXTEND = "native"
