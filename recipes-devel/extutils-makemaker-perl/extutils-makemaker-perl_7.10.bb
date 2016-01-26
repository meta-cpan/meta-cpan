DESCRIPTION = "This utility is designed to write a Makefile for an extension module \
from a Makefile.PL. It is based on the Makefile.SH model provided by \
Andy Dougherty and the perl5-porters."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-MakeMaker"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "\
    https://cpan.metacpan.org/authors/id/B/BI/BINGOS/ExtUtils-MakeMaker-7.10.tar.gz \
    file://no-packlist-neither-perllocal-legacy.patch \
"

SRC_URI[md5sum] = "2639a21adee5e0a903730c12dcba08ec"
SRC_URI[sha256sum] = "83b76cd49e458a55774e2e8d87bd1107bc159ba4219600c8ef10c6b43b0d94c5"

S = "${WORKDIR}/ExtUtils-MakeMaker-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
