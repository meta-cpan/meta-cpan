DESCRIPTION = "This module lets you check your module's namespaces for imported \
functions you might have forgotten to remove with namespace::autoclean \
or \
namespace::clean and are therefore available to be called as methods, \
which \
usually isn't want you want."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-CleanNamespaces"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Test-CleanNamespaces-0.18.tar.gz"

SRC_URI[md5sum] = "1d410cd60d6620a9d0b07bb4c23e8a44"
SRC_URI[sha256sum] = "3c497bb488175e622873275aa7636b42ab5ceac0a85a4598e1f1edb022264777"
RDEPENDS_${PN} += "file-find-rule-perl"
RDEPENDS_${PN} += "file-find-rule-perl-perl"
RDEPENDS_${PN} += "module-runtime-perl"
RDEPENDS_${PN} += "namespace-clean-perl"
RDEPENDS_${PN} += "package-stash-perl"
RDEPENDS_${PN} += "sub-exporter-perl"
RDEPENDS_${PN} += "sub-identify-perl"
RRECOMMENDS_${PN} += "package-stash-xs-perl"
DEPENDS += "test-deep-perl-native"
DEPENDS += "test-requires-perl-native"
DEPENDS += "test-simple-perl-native"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/Test-CleanNamespaces-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
