DESCRIPTION = ""require EXPR\" only accepts \"Class/Name.pm\" style module names, not \
\"Class::Name\". How frustrating! For that, we provide \"load_class \
'Class::Name'\"."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Class-Load"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/E/ET/ETHER/Class-Load-0.22.tar.gz"

SRC_URI[md5sum] = "ad59087e70b0df76d718c90b53e209d5"
SRC_URI[sha256sum] = "be52db6081b565002d68a1578ed06c7777b8845e92597be47f1c22e90b123111"
RDEPENDS_${PN} += "data-optlist-perl"
RDEPENDS_${PN} += "module-implementation-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "namespace-clean-perl"
RDEPENDS_${PN} += "package-stash-perl"
RDEPENDS_${PN} += "try-tiny-perl"
DEPENDS += "module-build-tiny-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"
RECOMMENDS += "perl"

S = "${WORKDIR}/Class-Load-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
