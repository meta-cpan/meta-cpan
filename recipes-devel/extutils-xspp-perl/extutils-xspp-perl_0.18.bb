DESCRIPTION = "XS++ is just a thin layer over plain XS, hence to use it you are supposed \
to know, at the very least, C++ and XS.  This means that you may need \
typemaps for both the normal XS pre-processor xsubpp and the XS++ \
pre-processor xspp."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-XSpp"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/S/SM/SMUELLER/ExtUtils-XSpp-0.18.tar.gz"

SRC_URI[md5sum] = "c44ad3281df81319d02833a4e42282ac"
SRC_URI[sha256sum] = "9176ad646729e3bd27cf7abf114bedd3424bff1ba61185cfc7d54f3a9223a8ff"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-base-perl-native"
DEPENDS += "test-differences-perl-native"
RDEPENDS_${PV} += "perl"

S = "${WORKDIR}/ExtUtils-XSpp-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
